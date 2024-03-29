package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ContactsAdapter.ContactsAdapter;
import Model.Contacts;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerview);
        List<Contacts>contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla", "9820351330" ,R.drawable.saugat) );
        contactsList.add(new Contacts("Bhuwan kc", "9843337670",R.drawable.bhuwan));
        contactsList.add(new Contacts("DAhayang Rai","98324353543",R.drawable.dahayang));
        contactsList.add(new Contacts("Rajesh Hamal","983737347",R.drawable.rajesh));
        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
