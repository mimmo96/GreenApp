package com.example.GreenApp.Channel;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*
 * Progetto: svilluppo App Android per Tirocinio interno
 *
 * Dipartimento di Informatica Università di Pisa
 *
 * Autore:Domenico Profumo matricola 533695
 * Si dichiara che il programma è in ogni sua parte, opera originale dell'autore
 *
 */

@Entity
public class Channel {
    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "id_key")
    private String lett_id;
    private String scritt_id;

    @ColumnInfo(name = "read_key")
    private String lett_read_key;
    private String scritt_read_key;
    private String write_key;

    @ColumnInfo(name = "position_key")
    private int position=0;
    private boolean notification=false;
    private String filed1=null;
    private String filed2=null;
    private String filed3=null;
    private String filed4=null;
    private String filed5=null;
    private String filed6=null;
    private String filed7=null;
    private String filed8=null;
    private Double tempMin=null;
    private Double tempMax=null;
    private Double umidMin=null;
    private Double umidMax=null;
    private Double condMin=null;
    private Double condMax=null;
    private Double phMin=null;
    private Double phMax=null;
    private Double irraMin=null;
    private Double irraMax=null;
    private Double pesMin=null;
    private Double pesMax=null;
    private int tempomax=0;
    private String imagetemp=null;
    private String imageumid=null;
    private String imageph=null;
    private String imagecond=null;
    private String imageirra=null;
    private String imagepeso=null;
    private Double evapotraspirazione=null;
    private Double IrrigationDuration=null;
    private Double FlussoAcqua=null;
    private Double Leachingfactor =null;
    private int Numirra =0;
    private int lastimevalues=0;
    //ultimo valore dato server in tempo
    private Double minutes=null;

    public Channel(String lett_id,String scritt_id, String lett_read_key,String scritt_read_key,String write_key) {
        this.lett_id = lett_id;
        this.scritt_id=scritt_id;
        this.lett_read_key=lett_read_key;
        this.scritt_read_key=scritt_read_key;
        this.write_key=write_key;
    }

    public int getTempomax() {
        return tempomax;
    }

    public void setTempomax(int tempomax) {
        this.tempomax = tempomax;
    }

    public boolean getNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2;
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3;
    }

    public String getFiled4() {
        return filed4;
    }

    public void setFiled4(String filed4) {
        this.filed4 = filed4;
    }

    public String getFiled5() {
        return filed5;
    }

    public void setFiled5(String fild5) {
        this.filed5 = fild5;
    }

    public String getFiled6() {
        return filed6;
    }

    public void setFiled6(String filed6) {
        this.filed6 = filed6;
    }

    public String getFiled7() {
        return filed7;
    }

    public void setFiled7(String filed7) {
        this.filed7 = filed7;
    }

    public String getFiled8() {
        return filed8;
    }

    public void setFiled8(String filed8) {
        this.filed8 = filed8;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getWrite_key() {
        return write_key;
    }

    public String getLett_id() {
        return lett_id;
    }

    public void setLett_id(String lett_id) { this.lett_id = lett_id; }

    public String getScritt_id() {
        return scritt_id;
    }

    public void setScritt_id(String scritt_id) {
        this.scritt_id = scritt_id;
    }

    public String getLett_read_key() { return lett_read_key; }

    public void setLett_read_key(String lett_read_key) {
        this.lett_read_key = lett_read_key;
    }

    public String getScritt_read_key() {
        return scritt_read_key;
    }

    public void setScritt_read_key(String scritt_read_key) { this.scritt_read_key = scritt_read_key; }

    public void setWrite_key(String write_key) {
        this.write_key = write_key;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int pos) {
        this.position = pos;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getUmidMin() {
        return umidMin;
    }

    public void setUmidMin(Double umidMin) {
        this.umidMin = umidMin;
    }

    public Double getUmidMax() {
        return umidMax;
    }

    public void setUmidMax(Double umidMax) {
        this.umidMax = umidMax;
    }

    public Double getCondMin() {
        return condMin;
    }

    public void setCondMin(Double condMin) {
        this.condMin = condMin;
    }

    public Double getCondMax() {
        return condMax;
    }

    public void setCondMax(Double condMax) {
        this.condMax = condMax;
    }

    public Double getPhMin() {
        return phMin;
    }

    public void setPhMin(Double phMin) {
        this.phMin = phMin;
    }

    public Double getPhMax() {
        return phMax;
    }

    public void setPhMax(Double phMax) {
        this.phMax = phMax;
    }

    public Double getIrraMin() {
        return irraMin;
    }

    public void setIrraMin(Double irraMin) {
        this.irraMin = irraMin;
    }

    public Double getIrraMax() {
        return irraMax;
    }

    public void setIrraMax(Double irraMax) {
        this.irraMax = irraMax;
    }

    public Double getPesMin() {
        return pesMin;
    }

    public void setPesMin(Double pesMin) {
        this.pesMin = pesMin;
    }

    public Double getPesMax() { return pesMax; }

    public void setPesMax(Double pesMax) {
        this.pesMax = pesMax;
    }

    public String getImagetemp() {
        return imagetemp;
    }

    public void setImagetemp(String imagetemp) {
        this.imagetemp = imagetemp;
    }

    public String getImageumid() {
        return imageumid;
    }

    public void setImageumid(String imageumid) { this.imageumid = imageumid; }

    public String getImageph() {
        return imageph;
    }

    public void setImageph(String imageph) {
        this.imageph = imageph;
    }

    public String getImagecond() {
        return imagecond;
    }

    public void setImagecond(String imagecond) {
        this.imagecond = imagecond;
    }

    public String getImageirra() {
        return imageirra;
    }

    public void setImageirra(String imageirra) {
        this.imageirra = imageirra;
    }

    public String getImagepeso() {
        return imagepeso;
    }

    public void setImagepeso(String imagepeso) {
        this.imagepeso = imagepeso;
    }

    public Double getIrrigationDuration() { return IrrigationDuration; }

    public void setIrrigationDuration(Double irrigationDuration) { IrrigationDuration = irrigationDuration; }

    public Double getFlussoAcqua() { return FlussoAcqua; }

    public void setFlussoAcqua(Double flussoAcqua) { FlussoAcqua = flussoAcqua; }

    public Double getLeachingfactor() { return Leachingfactor; }

    public void setLeachingfactor(Double leachingfactor) { Leachingfactor = leachingfactor; }

    public int getNumirra() { return Numirra; }

    public void setNumirra(int numirra) { Numirra = numirra; }

    public int getLastimevalues() {
        return lastimevalues;
    }

    public void setLastimevalues(int Lastimevalues) {
       lastimevalues = Lastimevalues;
    }

    public Double getEvapotraspirazione() {
        return evapotraspirazione;
    }

    public void setEvapotraspirazione(Double evapotraspirazione) { this.evapotraspirazione = evapotraspirazione; }

    public Double getMinutes() {
        return minutes;
    }

    public void setMinutes(Double minutes) {
        this.minutes = minutes;
    }
}