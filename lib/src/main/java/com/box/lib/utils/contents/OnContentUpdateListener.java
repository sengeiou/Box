package com.box.lib.utils.contents;

/**
 * Created by lolo on 15/2/26.
 */
public interface OnContentUpdateListener {

    String getKey();
    /** package*/
    void onContentUpdateSucceed(Object... values);
}
