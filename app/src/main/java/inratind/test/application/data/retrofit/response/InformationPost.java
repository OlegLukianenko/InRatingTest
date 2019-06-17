package inratind.test.application.data.retrofit.response;

import java.util.List;

public class InformationPost {

    public int id;
    public String slug;
    public int type;
    public boolean allow_comments;
    public boolean active;
    public String content;
    public Author author;
    public Attachments attachments;
    public String site_link;
    public List<String> intags;
    public String place;
    public String created_at;
    public int created_at_timestamp;
    public boolean is_repost;
    public String title;
    public List<AttachmentsOrder> attachments_order;
    public boolean is_liked;
    public int comments_count;
    public int likes_count;
    public String extra;
    public String visibility;
    public boolean is_avatar;
    public boolean is_bookmarked;
    public boolean is_reposted;
    public int bookmarks_count;
    public int reposts_count;
    public int views_count;

    public class Avatar_image {
        public String url_medium;
        public int id;
        public String url;
        public String url_large;
        public String url_small;
        public String url_origin;
        public String url_medium_origin;
        public String url_large_origin;
        public String url_small_origin;
        public int mentioned_users_count;

    }

    public class Rating {
        public int level;
        public int value;
        public int caption;
        public double proportion;
    }

    public class Author {
        public int id;
        public String nickname;
        public String active_gift;
        public Avatar_image avatar_image;
        public boolean off_page;
        public String name;
        public String lastname;
        public String status;
        public String gender;
        public boolean is_subscribed;
        public boolean is_online;
        public int last_online_timestamp;
        public boolean in_my_blacklist;
        public boolean has_me_in_blacklist;
        public Rating rating;
        public String comments;
        public String contest_entry_instance;
        public String chat_main_lang;
        public boolean is_voted;
    }

    public class Images {
        public String url_medium;
        public int id;
        public String url;
        public String url_large;
        public String url_small;
        public String url_origin;
        public String url_medium_origin;
        public String url_large_origin;
        public String url_small_origin;
        public int mentioned_users_count;
    }

    public class Attachments {
        public List<Images> images;
        public String videos;
        public String posts;
    }

    public class AttachmentsOrder {
        public int id;
        public String type;
    }
}