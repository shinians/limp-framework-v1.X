package com.limp.framework.utils;

import java.text.MessageFormat;

public final class TextUtils {
    public final static String format(String pattern, Object... param) {
        return new MessageFormat(pattern.replaceAll("'", "`")).format(param);
    }

    public static void main(String[] args) {
        System.out.println(TextUtils.format("中华{0}共和国{1}","人民","万岁"));;
    }
}
