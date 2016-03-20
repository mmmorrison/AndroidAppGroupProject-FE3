package com.example.aubreyford.androidappgroupproject_fe3;

import java.io.InputStream;
import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DecisionAdapter extends ArrayAdapter<Decision> {
//    ArrayList<Decision> decisionList;
//    LayoutInflater vi;
//    int Resource;
//    ViewHolder holder;

    public DecisionAdapter(Context context, ArrayList<Decision> decision) {
        super(context, R.layout.row, decision);
//        vi = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        Resource = resource;
//        decisionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.row, parent, false);

//        new JSONAsyncTask().execute("https://thisorthatdb.herokuapp.com/posters/decisions");

        Decision whatever = getItem(position);
        TextView title = (TextView) customView.findViewById(R.id.title);
        title.setText(whatever.getTitle());



//        ImageView picA = (ImageView) customView.findViewById(R.id.pic_A);
//        picA.setImageResource(R.drawable.fashion_a);

        Log.i("!!!!", "got to getView in DecisionAdapter");

        return customView;
//        // convert view = design
//        View v = convertView;
//        if (v == null) {
//            holder = new ViewHolder();
//            v = vi.inflate(Resource, null);
////            holder.pic_A = (ImageView) v.findViewById(R.id.pic_A);
////            holder.pic_B = (ImageView) v.findViewById(R.id.pic_B);
//            holder.title = (TextView) v.findViewById(R.id.title);
////            holder.tvDescription = (TextView) v.findViewById(R.id.tvDescription);
////			holder.tvDOB = (TextView) v.findViewById(R.id.tvDateOfBirth);
////			holder.tvCountry = (TextView) v.findViewById(R.id.tvCountry);
////			holder.tvHeight = (TextView) v.findViewById(R.id.tvHeight);
////			holder.tvSpouse = (TextView) v.findViewById(R.id.tvSpouse);
////			holder.tvChildren = (TextView) v.findViewById(R.id.tvChildren);
//            v.setTag(holder);
//        } else {
//            holder = (ViewHolder) v.getTag();
//        }
////        holder.pic_A.setImageResource(R.drawable.ic_launcher);
//        String url = decisionList.get(position).getPicA();
//        System.out.println("url in adapter****" + url);
//        new DownloadImageTask(holder.pic_A).execute(decisionList.get(position).getPicA());
////        holder.pic_B.setImageResource(R.drawable.ic_launcher);
//        new DownloadImageTask(holder.pic_B).execute(decisionList.get(position).getPicB());
////        holder.tvName.setText(actorList.get(position).getTitle());
////        holder.tvDescription.setText(actorList.get(position).getCategory());
////		holder.tvDOB.setText("B'day: " + actorList.get(position).getDob());
////		holder.tvCountry.setText(actorList.get(position).getCountry());
////		holder.tvHeight.setText("Height: " + actorList.get(position).getHeight());
////		holder.tvSpouse.setText("Spouse: " + actorList.get(position).getSpouse());
////		holder.tvChildren.setText("Children: " + actorList.get(position).getChildren());
//        return v;

    }

    static class ViewHolder {
        public ImageView pic_A;
        public ImageView pic_B;
        public TextView title;
//        public TextView tvDescription;
//        public TextView tvDOB;
//        public TextView tvCountry;
//        public TextView tvHeight;
//        public TextView tvSpouse;
//        public TextView tvChildren;

    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                Log.i("pic*******", urldisplay);
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }

    }
}