
package com.chinasofti.utils;

import com.chinasofti.bean.ShipBean;
import com.chinasofti.common.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.request.UpdateRequest;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;
import java.util.*;


/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 16-4-3
 * Time: 下午6:36
 * To change this template use File | Settings | File Templates.
 */

public class SolrDao {
    private static Logger log= Logger.getLogger(SolrDao.class.getName());
    //临时写死
    private  static String urlLocal = StoreControl.getValue("SOLR.CORE.URL");// "http://47.92.125.222:8081/solr/ship";

    private String solrUrl;
    private static SolrClient client;
    private int num = 10;
    private String zkUrl;
    private String collectionName;


    private SolrClient createNewSolrClient() {
        try {
            System.out.println("server address:" + urlLocal);
            HttpSolrClient client = new HttpSolrClient(urlLocal);
//            SolrClient client=new HttpSolrClient.Builder(urlLocal).build();
            client.setConnectionTimeout(30000);
            client.setDefaultMaxConnectionsPerHost(100);
            client.setMaxTotalConnections(100);
            client.setSoTimeout(30000);
            return client;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private SolrClient createCouldSolrClient() {
        CloudSolrClient client = new CloudSolrClient(zkUrl);
        client.setZkClientTimeout(30000);
        client.setZkConnectTimeout(50000);
        client.setDefaultCollection(collectionName);
        return client;
    }


    public void close() {
        try {
            client.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    public   Map<String,Object> query(String solrQuery,Class tClass,Integer page,Integer pageSize,String orderStr){
        SolrQuery query=new SolrQuery();
        query.setQuery(solrQuery);
        //设置起始点 ,第几个开始
        query.setStart((page - 1) * pageSize);
        //返回多少条数据
        query.setRows(pageSize);
//       query.set("sort", "accesstime_s desc");
        if(!StrUtils.isBlank(orderStr)){
            query.set("sort", orderStr);
        }
        try {
            Map<String,Object> map=new HashMap<String, Object>();
            QueryResponse response=client.query(query);
            log.debug("查询内容:" + query);
            System.out.println("查询内容:" + query);
            Map<String,Object> ext=new HashMap<String, Object>();
            System.out.println("文档数量：" + response.getResults().getNumFound());
            ext.put("num",response.getResults().getNumFound());
            ext.put("time",response.getQTime());
            System.out.println("查询花费时间:" + response.getQTime());
//            <T>  java.util.List<T> list =response.getBeans(tClass);
            map.put("result",response.getBeans(tClass));
            map.put("ext",ext) ;
            return map;
        } catch (SolrServerException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return  null;
    }
    public SolrDao() {
        this.solrUrl = urlLocal;
        this.client = createNewSolrClient();
        this.num = num;
    }

    public SolrDao(String zkUrl, int num, String collection) {
        this.zkUrl = zkUrl;
        this.num = num;
        collectionName = collection;
        this.client = createCouldSolrClient();
    }
    public void createDocs() {
        System.out.println("======================add doc ===================");
        Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
        for (int i = 1; i <= num; i++) {
            SolrInputDocument doc1 = new SolrInputDocument();
            doc1.addField("id", UUID.randomUUID().toString(), 1.0f);
            doc1.addField("name", "bean");
            doc1.addField("equIP_s", "192.168.2.104");
            doc1.addField("level_s", "4");
            doc1.addField("collectPro_s", "ffffffffffffffffffffjajajajajajdddddddddd");
            doc1.addField("sourceType_s", "miaohqaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            doc1.addField("filePath_s", "/home/xxxx/test");
            doc1.addField("filename_s", "zhonggggmaiaiadadadddddddddddddddddddddddddd");//            doc1.addField("_route_", "shard1");
            docs.add(doc1);
        }
        try {
            UpdateResponse rsp = client.add(docs);
            System.out
                    .println("Add doc size" + docs.size() + " result:" + rsp.getStatus() + " Qtime:" + rsp.getQTime());

            UpdateResponse rspcommit = client.commit();
            System.out.println("commit doc to index" + " result:" + rsp.getStatus() + " Qtime:" + rsp.getQTime());

        } catch (SolrServerException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void queryDocs() {
        SolrQuery params = new SolrQuery();
        System.out.println("======================query===================");
        params.set("q", "addparam_s:*");
        params.set("start", 0);
        params.set("rows", 5);
        params.set("sort", "accesstime_s desc");

        try {
            QueryResponse rsp = client.query(params);
            SolrDocumentList docs = rsp.getResults();
            System.out.println("查询内容:" + params);
            System.out.println("文档数量：" + docs.getNumFound());
            System.out.println("查询花费时间:" + rsp.getQTime());

            System.out.println("------query data:------");
            for (SolrDocument doc : docs) {
                // 多值查询
                @SuppressWarnings("unchecked")
                List<String> collectTime = (List<String>) doc.getFieldValue("collectTime");
                String clientmac_s = (String) doc.getFieldValue("clientmac_s");
                System.out.println("collectTime:" + collectTime + "\t clientmac_s:" + clientmac_s);
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteById(String id) {
        System.out.println("======================deleteById ===================");
        try {
            UpdateResponse rsp = client.deleteById(id);
            client.commit();
            System.out.println("delete id:" + id + " result:" + rsp.getStatus() + " Qtime:" + rsp.getQTime());
        } catch (SolrServerException | IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteByQuery(String queryCon) {
        System.out.println("======================deleteByQuery ===================");
        UpdateResponse rsp;

        try {
            UpdateRequest commit = new UpdateRequest();
            commit.deleteByQuery(queryCon);
            commit.setCommitWithin(5000);
            commit.process(client);
            System.out.println("url:"+commit.getPath()+"\t xml:"+commit.getXML()+" method:"+commit.getMethod());
//            rsp = client.deleteByQuery(queryCon);
//            client.commit();
//            System.out.println("delete query:" + queryCon + " result:" + rsp.getStatus() + " Qtime:" + rsp.getQTime());
        } catch (SolrServerException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void updateField(String id,String fieldName, Object fieldValue) {
        System.out.println("======================updateField ===================");
        HashMap<String, Object> oper = new HashMap<String, Object>();
//        多值更新方法
//        List<String> mulitValues = new ArrayList<String>();
//        mulitValues.add(fieldName);
//        mulitValues.add((String)fieldValue);
        oper.put("set", fieldValue);

        SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id", id);
        doc.addField(fieldName, oper);
        try {
            UpdateResponse rsp = client.add(doc);
            System.out.println("update doc id" + id + " result:" + rsp.getStatus() + " Qtime:" + rsp.getQTime());
            UpdateResponse rspCommit = client.commit();
            System.out.println("commit doc to index" + " result:" + rspCommit.getStatus() + " Qtime:" + rspCommit.getQTime());

        } catch (SolrServerException | IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args)throws Exception{
               SolrDao solrDao=new SolrDao();
//          List<ShipBean> list=solrDao.query("NAME:\"中华人民共和国黑龙江渔业船舶检验局\"",ShipBean.class);
//         Object list=solrDao.query("NAME:*黑龙江* OR ID:2300000",ShipBean.class,1,10);
//        System.out.println(list);
    }

}

