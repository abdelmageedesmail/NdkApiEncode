#include <jni.h>
#include <string>
extern "C" JNIEXPORT jstring JNICALL
Java_com_abdelmageed_myapplication_MainActivity_apiFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string apiKey = "TmF0aXZlNWVjcmV0UEBzc3cwcmQx";
    return env->NewStringUTF(apiKey.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_abdelmageed_myapplication_MainActivity_urlFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string url = "www.google.com";
    return env->NewStringUTF(url.c_str());
}
