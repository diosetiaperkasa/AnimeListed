package com.dio.animelist;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class Anime implements Parcelable {
    private String id = "id";
    private String judul = "judul";
    private String url = "url";
    private String srcVideo = "srcVideo";
    private String prev = "prev";
    private String all = "all";
    private String next = "next";
    private String img = "img";
    private String date = "date";
    private String ganre = "genre";
    private String halaman = "halaman";

    protected Anime(Parcel in) {
        id = in.readString();
        judul = in.readString();
        url = in.readString();
        srcVideo = in.readString();
        prev = in.readString();
        all = in.readString();
        next = in.readString();
        img = in.readString();
        date = in.readString();
        ganre = in.readString();
        halaman = in.readString();
    }

    public static final Creator<Anime> CREATOR = new Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel in) {
            return new Anime(in);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSrcVideo() {
        return srcVideo;
    }

    public void setSrcVideo(String srcVideo) {
        this.srcVideo = srcVideo;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGanre() {
        return ganre;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    public String getHalaman() {
        return halaman;
    }

    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }


    Anime(JSONObject obj) {
        try {
            String idjson = obj.getString("id");
            String judul = obj.getString("judul");
            String url = obj.getString("url");
            String src_video = obj.getString("video2");
            String prev_video = obj.getString("video3");
            String all_video = obj.getString("all_video");
            String next_video = obj.getString("next_video");
            String gambar = obj.getString("gambar");
            String tanggal = obj.getString("tanggal");
            String genre = obj.getString("genre");
            String halaman = obj.getString("halaman");

            this.id = idjson;
            this.judul = judul;
            this.url = url;
            this.srcVideo = src_video;
            this.prev = prev_video;
            this.all = all_video;
            this.next = next_video;
            this.img = gambar;
            this.date = tanggal;
            this.ganre = genre;
            this.halaman = halaman;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(judul);
        parcel.writeString(url);
        parcel.writeString(srcVideo);
        parcel.writeString(prev);
        parcel.writeString(all);
        parcel.writeString(next);
        parcel.writeString(img);
        parcel.writeString(date);
        parcel.writeString(ganre);
        parcel.writeString(halaman);
    }
}