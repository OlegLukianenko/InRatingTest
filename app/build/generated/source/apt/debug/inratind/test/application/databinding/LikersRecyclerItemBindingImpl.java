package inratind.test.application.databinding;
import inratind.test.application.R;
import inratind.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LikersRecyclerItemBindingImpl extends LikersRecyclerItemBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LikersRecyclerItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private LikersRecyclerItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.support.constraint.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            );
        this.Temp.setTag(null);
        this.headerResizer.setTag(null);
        this.image.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((inratind.test.application.data.retrofit.response.StatsStatistics.Data) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((inratind.test.application.app.home.adapter.LikersRecyclerAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable inratind.test.application.data.retrofit.response.StatsStatistics.Data Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setAdapter(@Nullable inratind.test.application.app.home.adapter.LikersRecyclerAdapter Adapter) {
        this.mAdapter = Adapter;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataAvatarImageUrlMediumOrigin = null;
        inratind.test.application.data.retrofit.response.StatsStatistics.Data data = mData;
        inratind.test.application.data.retrofit.response.StatsStatistics.Data.Avatar dataAvatarImage = null;
        java.lang.String dataNickname = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (data != null) {
                    // read data.avatar_image
                    dataAvatarImage = data.avatar_image;
                    // read data.nickname
                    dataNickname = data.nickname;
                }


                if (dataAvatarImage != null) {
                    // read data.avatar_image.url_medium_origin
                    dataAvatarImageUrlMediumOrigin = dataAvatarImage.url_medium_origin;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.Temp, dataNickname);
            inratind.test.application.utils.BindingAdapters.setAvatar(this.image, dataAvatarImageUrlMediumOrigin);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): adapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}