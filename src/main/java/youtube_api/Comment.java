package youtube_api;

import com.google.api.client.util.DateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment {
    private String author;
    private String commentText;
    private long likes;
    private DateTime lastUpdate;
    private boolean commentIsEdited;
}
