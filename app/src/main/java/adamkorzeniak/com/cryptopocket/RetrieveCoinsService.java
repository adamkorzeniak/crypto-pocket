package adamkorzeniak.com.cryptopocket;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

public class RetrieveCoinsService extends IntentService {

    public RetrieveCoinsService() {
        super("RetrieveCoinsService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        HTTPResource.getCoins();
    }

}
