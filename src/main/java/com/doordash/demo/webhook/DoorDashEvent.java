package com.doordash.demo.webhook;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoorDashEvent {
    private String cancellation_reason;
    private String cancellation_reason_message;
    private boolean contactless;
    private Date created_at;
    private String currency;
    private int dasher_id;
    private String dasher_name;
    private String dasher_pickup_phone_number;
    private Location dasher_location;
    private String dasher_vehicle_make;
    private String dasher_vehicle_model;
    private int dasher_vehicle_year;
    private String dropoff_address;
    private String dropoff_contact_family_name;
    private String dropoff_contact_given_name;
    private boolean dropoff_contact_send_notifications;
    private String dropoff_instructions;
    private String dropoff_phone_number;
    private Date dropoff_time_actual;
    private Date dropoff_time_estimated;
    private String dropoff_verification_image_url;
    private String dropoff_signature_image_url;
    private String event_name;
    private String external_delivery_id;
    private double fee;
    private double order_value;
    private String pickup_address;
    private String pickup_instructions;
    private String pickup_phone_number;
    private String pickup_reference_tag;
    private String pickup_external_business_id;
    private String pickup_external_store_id;
    private Date updated_at;
    private Date pickup_time_actual;
    private Date pickup_time_estimated;
    private String pickup_verification_image_url;
    private String return_address;
    private Date return_time_actual;
    private Date return_time_estimated;
    private String support_reference;
    private double tip;
    private String tracking_url;
}
