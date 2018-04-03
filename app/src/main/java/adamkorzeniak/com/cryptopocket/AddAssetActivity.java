package adamkorzeniak.com.cryptopocket;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class AddAssetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_asset);

        RecyclerView  mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        CardAdapter adapter = new CardAdapter(DatabaseMock.coinNames, DatabaseMock.coinSymbols);
        mRecyclerView.setAdapter(adapter);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        adapter.setListener(new CardAdapter.Listener() {
            public void onClick(int position) {
            }
        });
    }
}
