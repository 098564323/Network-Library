package com.icreative.networkLibrary;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAllData {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("user_data")
    @Expose
    private List<UserDatum> userData = null;
    @SerializedName("last_30_days")
    @Expose
    private List<Last30Day> last30Days = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserDatum> getUserData() {
        return userData;
    }

    public void setUserData(List<UserDatum> userData) {
        this.userData = userData;
    }

    public List<Last30Day> getLast30Days() {
        return last30Days;
    }

    public void setLast30Days(List<Last30Day> last30Days) {
        this.last30Days = last30Days;
    }

    public class Last30Day {

        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("device_id")
        @Expose
        private String deviceId;
        @SerializedName("device_token")
        @Expose
        private String deviceToken;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("emailId")
        @Expose
        private String emailId;
        @SerializedName("phoneNo")
        @Expose
        private String phoneNo;
        @SerializedName("sex")
        @Expose
        private String sex;
        @SerializedName("flight_no")
        @Expose
        private String flightNo;
        @SerializedName("organization")
        @Expose
        private String organization;
        @SerializedName("is_laser_strike")
        @Expose
        private String isLaserStrike;
        @SerializedName("laser_strike_latitude")
        @Expose
        private String laserStrikeLatitude;
        @SerializedName("laser_strike_longitude")
        @Expose
        private String laserStrikeLongitude;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("altitude")
        @Expose
        private String altitude;
        @SerializedName("minute")
        @Expose
        private String minute;
        @SerializedName("last_30_days")
        @Expose
        private String last30Days;
        @SerializedName("is_laser_in_month")
        @Expose
        private String isLaserInMonth;
        @SerializedName("is_flying")
        @Expose
        private String isFlying;
        @SerializedName("is_laser_in_last_five")
        @Expose
        private String isLaserInLastFive;
        @SerializedName("is_laser_in_time")
        @Expose
        private String isLaserInTime;
        @SerializedName("degree")
        @Expose
        private String degree;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getFlightNo() {
            return flightNo;
        }

        public void setFlightNo(String flightNo) {
            this.flightNo = flightNo;
        }

        public String getOrganization() {
            return organization;
        }

        public void setOrganization(String organization) {
            this.organization = organization;
        }

        public String getIsLaserStrike() {
            return isLaserStrike;
        }

        public void setIsLaserStrike(String isLaserStrike) {
            this.isLaserStrike = isLaserStrike;
        }

        public String getLaserStrikeLatitude() {
            return laserStrikeLatitude;
        }

        public void setLaserStrikeLatitude(String laserStrikeLatitude) {
            this.laserStrikeLatitude = laserStrikeLatitude;
        }

        public String getLaserStrikeLongitude() {
            return laserStrikeLongitude;
        }

        public void setLaserStrikeLongitude(String laserStrikeLongitude) {
            this.laserStrikeLongitude = laserStrikeLongitude;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAltitude() {
            return altitude;
        }

        public void setAltitude(String altitude) {
            this.altitude = altitude;
        }

        public String getMinute() {
            return minute;
        }

        public void setMinute(String minute) {
            this.minute = minute;
        }

        public String getLast30Days() {
            return last30Days;
        }

        public void setLast30Days(String last30Days) {
            this.last30Days = last30Days;
        }

        public String getIsLaserInMonth() {
            return isLaserInMonth;
        }

        public void setIsLaserInMonth(String isLaserInMonth) {
            this.isLaserInMonth = isLaserInMonth;
        }

        public String getIsFlying() {
            return isFlying;
        }

        public void setIsFlying(String isFlying) {
            this.isFlying = isFlying;
        }

        public String getIsLaserInLastFive() {
            return isLaserInLastFive;
        }

        public void setIsLaserInLastFive(String isLaserInLastFive) {
            this.isLaserInLastFive = isLaserInLastFive;
        }

        public String getIsLaserInTime() {
            return isLaserInTime;
        }

        public void setIsLaserInTime(String isLaserInTime) {
            this.isLaserInTime = isLaserInTime;
        }

        public String getDegree() {
            return degree;
        }

        public void setDegree(String degree) {
            this.degree = degree;
        }

    }

    public class UserDatum {

        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("device_id")
        @Expose
        private String deviceId;
        @SerializedName("device_token")
        @Expose
        private String deviceToken;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("emailId")
        @Expose
        private String emailId;
        @SerializedName("phoneNo")
        @Expose
        private String phoneNo;
        @SerializedName("sex")
        @Expose
        private String sex;
        @SerializedName("flight_no")
        @Expose
        private String flightNo;
        @SerializedName("organization")
        @Expose
        private String organization;
        @SerializedName("is_laser_strike")
        @Expose
        private String isLaserStrike;
        @SerializedName("laser_strike_latitude")
        @Expose
        private String laserStrikeLatitude;
        @SerializedName("laser_strike_longitude")
        @Expose
        private String laserStrikeLongitude;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("altitude")
        @Expose
        private String altitude;
        @SerializedName("minute")
        @Expose
        private String minute;
        @SerializedName("last_30_days")
        @Expose
        private String last30Days;
        @SerializedName("is_laser_in_month")
        @Expose
        private String isLaserInMonth;
        @SerializedName("is_flying")
        @Expose
        private String isFlying;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getFlightNo() {
            return flightNo;
        }

        public void setFlightNo(String flightNo) {
            this.flightNo = flightNo;
        }

        public String getOrganization() {
            return organization;
        }

        public void setOrganization(String organization) {
            this.organization = organization;
        }

        public String getIsLaserStrike() {
            return isLaserStrike;
        }

        public void setIsLaserStrike(String isLaserStrike) {
            this.isLaserStrike = isLaserStrike;
        }

        public String getLaserStrikeLatitude() {
            return laserStrikeLatitude;
        }

        public void setLaserStrikeLatitude(String laserStrikeLatitude) {
            this.laserStrikeLatitude = laserStrikeLatitude;
        }

        public String getLaserStrikeLongitude() {
            return laserStrikeLongitude;
        }

        public void setLaserStrikeLongitude(String laserStrikeLongitude) {
            this.laserStrikeLongitude = laserStrikeLongitude;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAltitude() {
            return altitude;
        }

        public void setAltitude(String altitude) {
            this.altitude = altitude;
        }

        public String getMinute() {
            return minute;
        }

        public void setMinute(String minute) {
            this.minute = minute;
        }

        public String getLast30Days() {
            return last30Days;
        }

        public void setLast30Days(String last30Days) {
            this.last30Days = last30Days;
        }

        public String getIsLaserInMonth() {
            return isLaserInMonth;
        }

        public void setIsLaserInMonth(String isLaserInMonth) {
            this.isLaserInMonth = isLaserInMonth;
        }

        public String getIsFlying() {
            return isFlying;
        }

        public void setIsFlying(String isFlying) {
            this.isFlying = isFlying;
        }

    }
}
