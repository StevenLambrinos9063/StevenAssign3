package steven.lambrinos.n01429063.a3.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class n01429063ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public n01429063ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}