package com.buytick.chatapplication.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.buytick.chatapplication.Models.Message;
import com.buytick.chatapplication.R;

import java.util.List;

public class ListContactAdapter extends RecyclerView.Adapter<ListContactAdapter.viewHolder>{

    private List<Message.Sender> userList;
    private Context context;
    private onClick onClick;

    public ListContactAdapter(Context context,List<Message.Sender> userList,onClick onClick) {
        this.userList = userList;
        this.context = context;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_contact_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Message.Sender user = userList.get(position);

//        holder.setStatusContact(user.getStatus());
        holder.setNameContact(user.getName());
//        holder.clicked(user);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private ConstraintLayout item;
        private FrameLayout statusContact;
        private TextView nameContact;

        public viewHolder(View itemView) {
            super(itemView);

            item = itemView.findViewById(R.id.item_contact);
            statusContact = itemView.findViewById(R.id.status_contact_fl);
            nameContact = itemView.findViewById(R.id.name_contact_tv);
        }

        public void setStatusContact(boolean status) {
            if(status)
                statusContact.setBackground(context.getResources().getDrawable(R.drawable.circule_shape_online));
            else
                statusContact.setBackground(context.getResources().getDrawable(R.drawable.circule_shape_offline));
        }

        public void setNameContact(String name) {
            nameContact.setText(name);
        }

        public int getStatusContact() {
            return statusContact.getSolidColor();
        }

        public void clicked(final Message.Sender user) {
            item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClick.itemContactClicked(user);
                }
            });
        }
    }

    public interface onClick {
        void itemContactClicked(Message.Sender user);
    }

}
