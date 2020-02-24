package myApp.smartkeypad.ui.icons;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IconsViewModel extends ViewModel
{
    private MutableLiveData<String> mText;

    public IconsViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Here is the icons fragment !");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}