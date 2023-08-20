package dev.somallef.WatchList.service;

public interface IConvertData {
    <T> T convert(String json, Class<T> tClass);
}
