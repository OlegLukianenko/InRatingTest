package inratind.test.application.data.retrofit.response;

import java.util.List;

public class StatsStatistics {

    public List<Data> data;
    public Meta meta;
    public Links links;


    public class Meta {
        public String path;
        public String per_page;
        public String total;
        public String last_page;
        public String from;
        public String to;
        public String current_page;
    }

    public class Links {
        public String last;
        public String first;
    }

    public class Data {
        public String off_page;
        public String gender;
        public String last_online_timestamp;
        public String multiplier;
        public Avatar avatar_image;
        public String lastname;
        public String has_me_in_blacklist;
        public String nickname;
        public String name;
        public String is_subscribed;
        public String id;
        public String is_online;
        public String status;
        public String in_my_blacklist;

        public class Avatar {
            public String mentioned_users_count;
            public String url_medium;
            public String url_large;
            public String url_medium_origin;
            public String url_large_origin;
            public String url_small;
            public String id;
            public String url_origin;
            public String url;
            public String url_small_origin;
        }
    }

}