var log={
		connectClick:false,
		gprsFlag:false,//定位功能
		//提示信息  
		info:function(message){
           // if(typeof message=="string"){
                console.log(message);//开发模式 可以启用此模式， 线上注释掉即可
		},
		debug:function(mes){
		  console.log(mes);
		},
		//错误信息
		error:function(msg){
			console.log(msg);
		}
}
 