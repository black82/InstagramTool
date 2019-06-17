package instagram.tool.instagram.model;

import java.sql.Date;
import java.sql.Time;

public class NpAutoFollowSchedule {
    private Long id;
    private Acount account_id;
    private Integer daily_pause;
    private Time daily_pause_from;
    private Time daily_pause_to;
    private String data;
    private Date end_date;
    private Integer is_active;
    private Date last_action_date;
    private Date schedule_date;
    private String speed;
    private String target;
    private User user_id;
}
