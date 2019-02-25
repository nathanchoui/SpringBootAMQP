package personal.nathan.domain;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/8/1.
 */
public class Message {

    private Long id;    //id

    private String msg; //消息

    private long timestamp = System.currentTimeMillis();  //时间戳

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
