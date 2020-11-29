package com.rmaj91.creational.builder.lombokBuilder;

public class LombokBuilder {

    private String name1;
    private String name2;
    private String name3;

    private LombokBuilder(String name1, String name2, String name3) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name1;
        private String name2;
        private String name3;

        public Builder name1(String name1) {
            this.name1 = name1;
            return this;
        }

        public Builder name2(String name2) {
            this.name2 = name2;
            return this;
        }

        public Builder name3(String name3) {
            this.name3 = name3;
            return this;
        }

        public LombokBuilder build() {
            return new LombokBuilder(name1, name2, name3);
        }
    }

}
