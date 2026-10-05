package com.API.Test.Deserilization;


// Deserialization

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponce {
    private String token;
    private String _id;
    private String current_location;
    private String email;
    private String first_name;

    public LoginResponce() // Default consructor
    {

    }

    public LoginResponce(String _id, String current_location, String email, String first_name, String token) {
        this._id = _id;
        this.current_location = current_location;
        this.email = email;
        this.first_name = first_name;
        this.token = token;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCurrent_location() {
        return current_location;
    }

    public void setCurrent_location(String current_location) {
        this.current_location = current_location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginResponce{" +
                "_id='" + _id + '\'' +
                ", token='" + token + '\'' +
                ", current_location='" + current_location + '\'' +
                ", email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                '}';
    }
}
