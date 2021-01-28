package com.tencent.android.tpns

class TUtil {
    public static boolean isUpgrade(String sdkConfig) {
        def version1201 = new Version(TConstant.VERSION_1201)
        def sdkVersion = new Version(sdkConfig)
        return sdkVersion.compareTo(version1201) >= 0
    }

    public static boolean isEmpty(String str) {
        if (null == str || str.length() == 0) {
            return true
        } else {
            return false
        }
    }
}