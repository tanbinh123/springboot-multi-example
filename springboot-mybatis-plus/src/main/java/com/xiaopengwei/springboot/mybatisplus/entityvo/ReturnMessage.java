package com.xiaopengwei.springboot.mybatisplus.entityvo;import java.util.List;/** * <p> * 返回消息 VO 类 * </p> * * @author github.com/xpwi * @since 2019-04-12 */public class ReturnMessage {    /**     * 状态码     */    private String state;    /**     * 提示消息     */    private String message;    /**     * 实体类信息     */    private List<?> data;    public String getState() {        return state;    }    public void setState(String state) {        this.state = state;    }    public String getMessage() {        return message;    }    public void setMessage(String message) {        this.message = message;    }    public List<?> getData() {        return data;    }    public void setData(List<?> data) {        this.data = data;    }}