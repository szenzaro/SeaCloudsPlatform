/**
 * Copyright 2014 SeaClouds
 * Contact: SeaClouds
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package eu.seaclouds.common.objectmodel;

public class Scalar implements Comparable<Scalar>{
    int value;
    ScalarUnits unit;

    public Scalar(int value, ScalarUnits unit){
        this.value = value;
        this.unit = unit;
    }

    @Override
    public int compareTo(Scalar o) {
        throw new UnsupportedOperationException(); //TODO: units conversion?
    }
}