package org.miaadkafka.demospringcloudstreams.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
