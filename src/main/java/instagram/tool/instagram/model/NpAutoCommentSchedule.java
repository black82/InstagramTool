package instagram.tool.instagram.model;

import java.sql.Date;
import java.sql.Time;

public class NpAutoCommentSchedule {
    private Long id;
    private Integer account_id;
    private String comments;
    private Integer daily_pause;
    private Time daily_pause_from;
    private  Time daily_pause_to;
    private Date data;
    private  Date end_date;
    private Integer is_active;
    private Date last_action_date;
    private Date schedule_date;
    private String speed;
    private String target;
    private String timeline_feed;
    private User user_id;

}
