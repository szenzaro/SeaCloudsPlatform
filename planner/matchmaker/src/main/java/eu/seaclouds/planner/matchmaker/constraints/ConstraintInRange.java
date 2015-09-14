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
package eu.seaclouds.planner.matchmaker.constraints;


import eu.seaclouds.planner.matchmaker.PropertyValue;

public class ConstraintInRange<Integer> extends Constraint {

    public ConstraintInRange(String name, int minValue, int maxValue) {
        super(name, ConstraintTypes.InRange, new int[] { minValue, maxValue });
    }

    public boolean checkConstraint(PropertyValue prop) {
        try {
            int[] range = (int[]) value;
            int v = java.lang.Integer.parseInt((String) prop.getValue());
            return v >= range[0] && v <= range[1];
        }catch (Exception e){
            return false;
        }
    }
}
