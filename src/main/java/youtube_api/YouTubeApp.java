package youtube_api;

public class YouTubeApp {
    public static void main(String[] args) {
        YouTubeCommentParser parser = new YouTubeCommentParser();
        parser.init();
        parser.getCommentsFromVideos("yb5Vk6Hw08U");
        for (YouTubeVideo video : parser.getListOfVideos()) {
            for (Comment comment : video.getComments()) {
                System.out.println("Author: " + comment.getAuthor());
                System.out.println("Comment: " + comment.getCommentText());
                System.out.println("Upload date: " + comment.getLastUpdate());
                System.out.println("Likes: " + comment.getLikes());
                System.out.println("Edited: " + comment.isCommentIsEdited());
                System.out.println("----------------------------------------");
            }
        }
    }
}
