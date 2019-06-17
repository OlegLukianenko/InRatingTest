package inratind.test.application.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import inratind.test.application.R;

public class BindingAdapters {

    @BindingAdapter("setAvatar")
    public static void setAvatar(ImageView imageView, String url) {
        Picasso.get().load(url).transform(new PicassoCircleTransform()).placeholder(R.drawable.ic_user_placeholder).into(imageView);
    }

}
