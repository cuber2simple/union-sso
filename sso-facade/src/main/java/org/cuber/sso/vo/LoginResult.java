package org.cuber.sso.vo;

public enum LoginResult {
    success("成功"),
    fail("失败"),
    abnormal("异常"),
    reject("拒绝")
    ;

    LoginResult(String desc) {
        this.desc = desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
