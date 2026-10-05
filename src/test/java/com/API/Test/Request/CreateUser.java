package com.API.Test.Request;

import java.util.ArrayList;
import java.util.List;

public class CreateUser {

    private String first_name;
    private String last_name;
    private String email;
    private String username;
    private String password;
    private String userole;
    private boolean is_send_email;
    private List<String> apps;
    private List<String> organizations;
    private List<LocationRole> location_role;

    public CreateUser(String first_name, String last_name, String email, String username,
                      String password, String userole, boolean is_send_email,
                      List<String> apps, List<String> organizations, List<LocationRole> location_role)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.userole = userole;
        this.is_send_email = is_send_email;
        this.apps = apps;
        this.organizations = organizations;
        this.location_role = location_role;
    }

    public String getFirst_name() { return first_name; }
    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }
    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getUserole() { return userole; }
    public void setUserole(String userole) { this.userole = userole; }

    public boolean isIs_send_email() { return is_send_email; }
    public void setIs_send_email(boolean is_send_email) { this.is_send_email = is_send_email; }

    public List<String> getApps() { return apps; }
    public void setApps(List<String> apps) { this.apps = apps; }

    public List<String> getOrganizations() { return organizations; }
    public void setOrganizations(List<String> organizations) { this.organizations = organizations; }

    public List<LocationRole> getLocation_role() { return location_role; }
    public void setLocation_role(List<LocationRole> location_role) { this.location_role = location_role; }

    @Override
    public String toString() {
        return "CreateUser{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userole='" + userole + '\'' +
                ", is_send_email=" + is_send_email +
                ", apps=" + apps +
                ", organizations=" + organizations +
                ", location_role=" + location_role +
                '}';
    }

    public static class Builder {
        private String first_name;
        private String last_name;
        private String email;
        private String username;
        private String password;
        private String userole;
        private boolean is_send_email;
        private List<String> apps;
        private List<String> organizations;
        private List<LocationRole> location_role;

        public Builder Firstname(String first_name) {
            this.first_name = first_name;
            return this;
        }

        public Builder Lastname(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public Builder Email(String email) {
            this.email = email;
            return this;
        }

        public Builder Username(String username) {
            this.username = username;
            return this;
        }

        public Builder Password(String password) {
            this.password = password;
            return this;
        }

        public Builder Userole(String userole) {
            this.userole = userole;
            return this;
        }

        public Builder IsSendEmail(boolean is_send_email) {
            this.is_send_email = is_send_email;
            return this;
        }

        public Builder Apps(List<String> apps) {
            this.apps = apps;
            return this;
        }

        public Builder addApp(String appId) {
         //   if (this.apps == null) {
                this.apps = new ArrayList<>();
            //}
            this.apps.add(appId);
            return this;
        }

        public Builder Organizations(List<String> organizations) {
            this.organizations = organizations;
            return this;
        }

        public Builder LocationRoles(List<LocationRole> location_role) {
            this.location_role = location_role;
            return this;
        }

        // add one location + role pair at a time, as separate values
        public Builder addLocationRole(String location, String role) {
            if (this.location_role == null) {
                this.location_role = new ArrayList<>();
            }
            this.location_role.add(new LocationRole(location, role));
            return this;
        }

        public CreateUser build() {
            return new CreateUser(first_name, last_name, email, username, password, userole,
                    is_send_email, apps, organizations, location_role);
        }
    }

    // nested class for location role
    public static class LocationRole {

        private String location;
        private String role;

        public LocationRole() {
        }

        public LocationRole(String location, String role) {
            this.location = location;
            this.role = role;
        }

        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }

        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }

        @Override
        public String toString() {
            return "LocationRole{" +
                    "location='" + location + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }

//        public static class LocationBuilder {
//            private String location;
//            private String role;
//
//            public LocationBuilder Location(String location) {
//                this.location = location;
//                return this;
//            }
//
//            public LocationBuilder role(String role) {
//                this.role = role;
//                return this;
//            }
//
//            public LocationRole build() {
//                return new LocationRole(location, role);
//            }
//        }
    }
}