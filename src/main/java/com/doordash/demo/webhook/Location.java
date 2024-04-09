package com.doordash.demo.webhook;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Location {
        private double lat;
        private double lng;

        // getters and setters for lat and lng
    }