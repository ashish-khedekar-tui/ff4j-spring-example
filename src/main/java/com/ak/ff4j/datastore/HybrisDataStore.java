package com.ak.ff4j.datastore;

import org.ff4j.core.Feature;
import org.ff4j.store.AbstractFeatureStore;

import java.util.Map;

//Hybris Datastore which will retrieve Feature Toggles using DAO, should use
public class HybrisDataStore extends AbstractFeatureStore
{



    @Override
    public boolean exist(String featId) {
        return false;
    }

    @Override
    public void create(Feature fp) {

    }

    @Override
    public Feature read(String featureUid) {
        return null;
    }

    @Override
    public Map<String, Feature> readAll() {
        return null;
    }

    @Override
    public void delete(String fpId) {

    }

    @Override
    public void update(Feature fp) {

    }

    @Override
    public void clear() {

    }
}
