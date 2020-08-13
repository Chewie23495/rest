/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rest;

import java.util.List;

/**
 *
 * @author korth
 */
public class Data {

    public static class Address {

        private List<Integer> colorKeys;
        private List<Integer> values;

        public void setColorKeys(List<Integer> colorKeys) {
            this.colorKeys = colorKeys;
        }

        public List<Integer> getColorKeys() {
            return colorKeys;
        }

   

        public void setValues(List<Integer> values) {
            this.values = values;
        }

        public List<Integer> getValues() {
            return values;
        }
        
    }

    public static class Meta {
        private Integer digits;
        private String processingPattern;

        public Integer getDigits() {
            return digits;
        }

        public String getProcessingPattern() {
            return processingPattern;
        }

        public void setDigits(Integer digits) {
            this.digits = digits;
        }

        public void setProcessingPattern(String processingPattern) {
            this.processingPattern = processingPattern;
        }
        
    }

    private Address address;
    private Meta meta;

    public Address getAddress() {
        return address;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
