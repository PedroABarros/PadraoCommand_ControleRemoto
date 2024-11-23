package org.example;

public class TV{
        private Integer volume;
        private Integer canal;
        private String status;

    public TV(Integer volume, Integer canal) {
        this.setVolume(volume);
        this.setCanal(canal);
        this.setStatus("Desligado");
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSituacao() {
        return "{\"volume\": " + getVolume() + ", \"canal\": " + getCanal() + ", \"status\": " + this.getStatus() + "}";
    }

    public void trocarVolume(Integer volume) {
        this.setVolume(this.getVolume() + volume);
    }

    public void ligarDesligar(String status) {
        this.setStatus(status);
    }




}
