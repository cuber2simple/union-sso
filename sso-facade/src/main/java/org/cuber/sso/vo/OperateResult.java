package org.cuber.sso.vo;

public enum OperateResult {
    success("成功"),
    fail("失败"),
    abnormal("异常")
    ;

    OperateResult(String desc) {
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
