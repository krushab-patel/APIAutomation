package com.API.Test.Deserilization;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class UserAPIResponce {

    private String status;
    private String message;
    private String error;
    private Datawrapper data;

    public Datawrapper getData()
    {
        return data;
    }
    public void setData(Datawrapper data)
    {
        this.data = data;
    }
    public String getError()
    {
        return error;
    }
    public void setError(String error)
    {
        this.error = error;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public static class Datawrapper {
        @JsonProperty("_id")
        private String id;

        @JsonProperty("location_role")
        private List<Location_role> locationRole;

        public String getId()
        {
            return id;
        }
        public void setId(String id)
        {
            this.id = id;
        }
        public List<Location_role> getLocationRole()
        {
            return locationRole;
        }
        public void setLocationRole(List<Location_role> locationRole)
        {
            this.locationRole = locationRole;
        }
    }

    public static class Location_role {
        private Refobject location;
        private String organization;
        private Refobject role;

        public Refobject getLocation()
        {
            return location;
        }
        public void setLocation(Refobject location)
        {
            this.location = location;
        }
        public String getOrganization()
        {
            return organization;
        }
        public void setOrganization(String organization)
        {
            this.organization = organization;
        }
        public Refobject getRole()
        {
            return role;
        }
        public void setRole(Refobject role)
        {
            this.role = role;
        }

        public static class Refobject {
            @JsonProperty("$ref")
            private String ref;

            @JsonProperty("_type")
            private String type;

            public String getRef()
            {
                return ref;
            }
            public void setRef(String ref)
            {
                this.ref = ref;
            }
            public String getType()
            {
                return type;
            }
            public void setType(String type)
            {
                this.type = type;
            }
        }
    }
}