package org.example.objectClassMethod;

public class Address {

           public int getHouseNo() {
            return houseNo;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "houseNo=" + houseNo +
                    ", city='" + city + '\'' +
                    '}';
        }

        public Address(int houseNo, String city) {
            this.houseNo = houseNo;
            this.city = city;
        }

        public void setHouseNo(int houseNo) {
            this.houseNo = houseNo;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        private int houseNo;
        private String city;
    }


