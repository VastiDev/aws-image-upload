package br.com.vastidev.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("aws-image-upload-vastidev");

    private final String bucketName;
    BucketName(String bucketName){
        this.bucketName = bucketName;
    }
    public String getBucketName(){
        return bucketName;
    }
}
