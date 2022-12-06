package com.unitedcoder.homework;

public class Category {
    private String name;
    private String status;
    private boolean visible;
    private String parentCategory;

    public Category(String name, String status, boolean visible, String parentCategory) {
        this.name = name;
        this.status = status;
        this.visible = visible;
        this.parentCategory = parentCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", visible=" + visible +
                ", parentCategory='" + parentCategory + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Category category=new Category("Idikut","Mr",true,"Customer");
        System.out.println(category);
    }
}
