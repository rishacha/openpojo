/*
 * Copyright (c) 2010-2014 Osman Shoukry
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation, either version 3 of the License or any
 *    later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.openpojo.issues.issue45.sample;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.openpojo.log.LoggerFactory;
import com.openpojo.random.collection.util.SerializeableComparableObject;
import org.junit.Assert;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

/**
 * @author oshoukry
 */
@SuppressWarnings("all")
public class ClassWithVariousGenericSetList {
    private List listUndefined;
    private List<?> listUnbounded;
    private List<SomeGeneric> listSomeGeneric;
    private List<? extends SomeGeneric> listExtendsSomeGeneric;
    private List<? super SomeGeneric> listSuperSomeGeneric;
    private List<List> listOfListUndefined;
    private List<List<?>> listOfListUnbounded;
    private List<List<SomeGeneric>> listOfListOfSomeGeneric;
    private List<List<? extends SomeGeneric>> listOfListOfExtendsSomeGeneric;
    private List<List<? super SomeGeneric>> listOfListOfSuperSomeGeneric;

    private List<Map> listOfMap;

    private Queue queueUndefined;
    private Queue<?> queueUnbounded;
    private Queue<SomeGeneric> queueSomeGeneric;
    private Queue<? extends SomeGeneric> queueExtendsSomeGeneric;
    private Queue<? super SomeGeneric> queueSuperSomeGeneric;
    private Queue<Queue> queueOfQueueUndefined;
    private Queue<Queue<?>> queueOfQueueUnbounded;
    private Queue<Queue<SomeGeneric>> queueOfQueueOfSomeGeneric;
    private Queue<Queue<? extends SomeGeneric>> queueOfQueueOfExtendsSomeGeneric;
    private Queue<Queue<? super SomeGeneric>> queueOfQueueOfSuperSomeGeneric;

    private Queue<Map> queueOfMap;

    private Set setUndefined;
    private Set<?> setUnbounded;
    private Set<SomeGeneric> setSomeGeneric;
    private Set<? extends SomeGeneric> setExtendsSomeGeneric;
    private Set<? super SomeGeneric> setSuperSomeGeneric;
    private Set<Set> setOfSetUndefined;
    private Set<Set<?>> setOfSetUnbounded;
    private Set<Set<SomeGeneric>> setOfSetOfSomeGeneric;
    private Set<Set<? extends SomeGeneric>> setOfSetOfExtendsSomeGeneric;
    private Set<Set<? super SomeGeneric>> setOfSetOfSuperSomeGeneric;

    private Set<Map<SomeInterface, SomeGeneric>> setOfMapOfSomeInterfaceAndSomeGeneric;

    private Queue<Set<List<SomeGeneric>>> queueOfSetOfListOfSomeGeneric;
    private Set<List<Set<SomeGeneric>>> setOfListOfSetOfSomeGeneric;

    private List<Set<? super SomeInterface>> listOfSetOfSuperSomeInterface;

    private Map<?,?> mapUnbounded;

    public void setListUndefined(List listUndefined) {
        assertParameterOfExpectedStructure(listUndefined, List.class, SerializeableComparableObject.class);
        this.listUndefined = listUndefined;
    }

    public void setListUnbounded(List<?> listUnbounded) {
        assertParameterOfExpectedStructure(listUnbounded, List.class, Object.class);
        this.listUnbounded = listUnbounded;
    }

    public void setListSomeGeneric(List<SomeGeneric> listSomeGeneric) {
        assertParameterOfExpectedStructure(listSomeGeneric, List.class, SomeGeneric.class);
        this.listSomeGeneric = listSomeGeneric;
    }

    public void setListExtendsSomeGeneric(List<? extends SomeGeneric> listExtendsSomeGeneric) {
        assertParameterOfExpectedStructure(listExtendsSomeGeneric, List.class, SomeGeneric.class);
        this.listExtendsSomeGeneric = listExtendsSomeGeneric;
    }

    public void setListSuperSomeGeneric(List<? super SomeGeneric> listSuperSomeGeneric) {
        assertParameterOfExpectedStructure(listSuperSomeGeneric, List.class, SomeGeneric.class);
        this.listSuperSomeGeneric = listSuperSomeGeneric;
    }

    public void setListOfListUndefined(List<List> listOfListUndefined) {
        assertParameterOfExpectedStructure(listOfListUndefined, List.class, List.class, SerializeableComparableObject.class);
        this.listOfListUndefined = listOfListUndefined;
    }

    public void setListOfListUnbounded(List<List<?>> listOfListUnbounded) {
        assertParameterOfExpectedStructure(listOfListUnbounded, List.class, List.class, Object.class);
        this.listOfListUnbounded = listOfListUnbounded;
    }

    public void setListOfListOfSomeGeneric(List<List<SomeGeneric>> listOfListOfSomeGeneric) {
        assertParameterOfExpectedStructure(listOfListOfSomeGeneric, List.class, List.class, SomeGeneric.class);
        this.listOfListOfSomeGeneric = listOfListOfSomeGeneric;
    }

    public void setListOfListOfExtendsSomeGeneric(List<List<? extends SomeGeneric>> listOfListOfExtendsSomeGeneric) {
        assertParameterOfExpectedStructure(listOfListOfExtendsSomeGeneric, List.class, List.class, SomeGeneric.class);
        this.listOfListOfExtendsSomeGeneric = listOfListOfExtendsSomeGeneric;
    }

    public void setListOfListOfSuperSomeGeneric(List<List<? super SomeGeneric>> listOfListOfSuperSomeGeneric) {
        assertParameterOfExpectedStructure(listOfListOfSuperSomeGeneric, List.class, List.class, SomeGeneric.class);
        this.listOfListOfSuperSomeGeneric = listOfListOfSuperSomeGeneric;
    }

    public void setListOfMap(List<Map> listOfMap) {
        assertParameterOfExpectedStructure(listOfMap, List.class, Map.class);
        this.listOfMap = listOfMap;
    }

    public void setQueueUndefined(Queue queueUndefined) {
        assertParameterOfExpectedStructure(queueUndefined, Queue.class, SerializeableComparableObject.class);
        this.queueUndefined = queueUndefined;
    }

    public void setQueueUnbounded(Queue<?> queueUnbounded) {
        assertParameterOfExpectedStructure(queueUnbounded, Queue.class, Object.class);
        this.queueUnbounded = queueUnbounded;
    }

    public void setQueueSomeGeneric(Queue<SomeGeneric> queueSomeGeneric) {
        assertParameterOfExpectedStructure(queueSomeGeneric, Queue.class, SomeGeneric.class);
        this.queueSomeGeneric = queueSomeGeneric;
    }

    public void setQueueExtendsSomeGeneric(Queue<? extends SomeGeneric> queueExtendsSomeGeneric) {
        assertParameterOfExpectedStructure(queueExtendsSomeGeneric, Queue.class, SomeGeneric.class);
        this.queueExtendsSomeGeneric = queueExtendsSomeGeneric;
    }

    public void setQueueSuperSomeGeneric(Queue<? super SomeGeneric> queueSuperSomeGeneric) {
        assertParameterOfExpectedStructure(queueSuperSomeGeneric, Queue.class, SomeGeneric.class);
        this.queueSuperSomeGeneric = queueSuperSomeGeneric;
    }

    public void setQueueOfQueueUndefined(Queue<Queue> queueOfQueueUndefined) {
        assertParameterOfExpectedStructure(queueOfQueueUndefined, Queue.class, Queue.class, SerializeableComparableObject.class);
        this.queueOfQueueUndefined = queueOfQueueUndefined;
    }

    public void setQueueOfQueueUnbounded(Queue<Queue<?>> queueOfQueueUnbounded) {
        assertParameterOfExpectedStructure(queueOfQueueUnbounded, Queue.class, Queue.class, Object.class);
        this.queueOfQueueUnbounded = queueOfQueueUnbounded;
    }

    public void setQueueOfQueueOfSomeGeneric(Queue<Queue<SomeGeneric>> queueOfQueueOfSomeGeneric) {
        assertParameterOfExpectedStructure(queueOfQueueOfSomeGeneric, Queue.class, Queue.class, SomeGeneric.class);
        this.queueOfQueueOfSomeGeneric = queueOfQueueOfSomeGeneric;
    }

    public void setQueueOfQueueOfExtendsSomeGeneric(Queue<Queue<? extends SomeGeneric>> queueOfQueueOfExtendsSomeGeneric) {
        assertParameterOfExpectedStructure(queueOfQueueOfExtendsSomeGeneric, Queue.class, Queue.class, SomeGeneric.class);
        this.queueOfQueueOfExtendsSomeGeneric = queueOfQueueOfExtendsSomeGeneric;
    }

    public void setQueueOfQueueOfSuperSomeGeneric(Queue<Queue<? super SomeGeneric>> queueOfQueueOfSuperSomeGeneric) {
        assertParameterOfExpectedStructure(queueOfQueueOfSuperSomeGeneric, Queue.class, Queue.class, SomeGeneric.class);
        this.queueOfQueueOfSuperSomeGeneric = queueOfQueueOfSuperSomeGeneric;
    }

    public void setQueueOfMap(Queue<Map> queueOfMap) {
        assertParameterOfExpectedStructure(queueOfMap, Queue.class, Map.class);
        this.queueOfMap = queueOfMap;
    }    
    

    public void setSetUndefined(Set setUndefined) {
        assertParameterOfExpectedStructure(setUndefined, Set.class, SerializeableComparableObject.class);
        this.setUndefined = setUndefined;
    }

    public void setSetUnbounded(Set<?> setUnbounded) {
        assertParameterOfExpectedStructure(setUnbounded, Set.class, Object.class);
        this.setUnbounded = setUnbounded;
    }

    public void setSetSomeGeneric(Set<SomeGeneric> setSomeGeneric) {
        assertParameterOfExpectedStructure(setSomeGeneric, Set.class, SomeGeneric.class);
        this.setSomeGeneric = setSomeGeneric;
    }

    public void setSetExtendsSomeGeneric(Set<? extends SomeGeneric> setExtendsSomeGeneric) {
        assertParameterOfExpectedStructure(setExtendsSomeGeneric, Set.class, SomeGeneric.class);
        this.setExtendsSomeGeneric = setExtendsSomeGeneric;
    }

    public void setSetSuperSomeGeneric(Set<? super SomeGeneric> setSuperSomeGeneric) {
        assertParameterOfExpectedStructure(setSuperSomeGeneric, Set.class, SomeGeneric.class);
        this.setSuperSomeGeneric = setSuperSomeGeneric;
    }

    public void setSetOfSetUndefined(Set<Set> setOfSetUndefined) {
        assertParameterOfExpectedStructure(setOfSetUndefined, Set.class, Set.class, SerializeableComparableObject.class);
        this.setOfSetUndefined = setOfSetUndefined;
    }

    public void setSetOfSetUnbounded(Set<Set<?>> setOfSetUnbounded) {
        assertParameterOfExpectedStructure(setOfSetUnbounded, Set.class, Set.class, Object.class);
        this.setOfSetUnbounded = setOfSetUnbounded;
    }

    public void setSetOfSetOfSomeGeneric(Set<Set<SomeGeneric>> setOfSetOfSomeGeneric) {
        assertParameterOfExpectedStructure(setOfSetOfSomeGeneric, Set.class, Set.class, SomeGeneric.class);
        this.setOfSetOfSomeGeneric = setOfSetOfSomeGeneric;
    }

    public void setSetOfSetOfExtendsSomeGeneric(Set<Set<? extends SomeGeneric>> setOfSetOfExtendsSomeGeneric) {
        assertParameterOfExpectedStructure(setOfSetOfExtendsSomeGeneric, Set.class, Set.class, SomeGeneric.class);
        this.setOfSetOfExtendsSomeGeneric = setOfSetOfExtendsSomeGeneric;
    }

    public void setSetOfSetOfSuperSomeGeneric(Set<Set<? super SomeGeneric>> setOfSetOfSuperSomeGeneric) {
        assertParameterOfExpectedStructure(setOfSetOfSuperSomeGeneric, Set.class, Set.class, SomeGeneric.class);
        this.setOfSetOfSuperSomeGeneric = setOfSetOfSuperSomeGeneric;
    }

    public void setSetOfMapOfSomeInterfaceAndSomeGeneric(Set<Map<SomeInterface, SomeGeneric>> setOfMapOfSomeInterfaceAndSomeGeneric) {
        assertParameterOfExpectedStructure(setOfMapOfSomeInterfaceAndSomeGeneric, Set.class, Map.class, SomeInterface.class,
                SomeGeneric.class);
        this.setOfMapOfSomeInterfaceAndSomeGeneric = setOfMapOfSomeInterfaceAndSomeGeneric;
    }

    public void setQueueOfSetOfListOfSomeGeneric(Queue<Set<List<SomeGeneric>>> queueOfSetOfListOfSomeGeneric) {
        assertParameterOfExpectedStructure(queueOfSetOfListOfSomeGeneric, Queue.class, Set.class, List.class, SomeGeneric.class);
        this.queueOfSetOfListOfSomeGeneric = queueOfSetOfListOfSomeGeneric;
    }

    public void setSetOfListOfSetOfSomeGeneric(Set<List<Set<SomeGeneric>>> setOfListOfSetOfSomeGeneric) {
        assertParameterOfExpectedStructure(setOfListOfSetOfSomeGeneric, Set.class, List.class, Set.class, SomeGeneric.class);
        this.setOfListOfSetOfSomeGeneric = setOfListOfSetOfSomeGeneric;
    }

    public void setListOfSetOfSuperSomeInterface(List<Set<? super SomeInterface>> listOfSetOfSuperSomeInterface) {
        assertParameterOfExpectedStructure(listOfSetOfSuperSomeInterface, List.class, Set.class, SomeInterface.class);
        this.listOfSetOfSuperSomeInterface = listOfSetOfSuperSomeInterface;
    }

    public void setMapUnbounded(Map<?,?> mapUnbounded) {
        assertParameterOfExpectedStructure(mapUnbounded, Map.class);
        this.mapUnbounded = mapUnbounded;
    }

    private void assertParameterOfExpectedStructure(Object input, Class<?>... expectedTypes) {
        LoggerFactory.getLogger(this.getClass()).trace("Checking: [" + input + "] with types " + Arrays.toString(expectedTypes));
        assertTypeIsAssignable(input, expectedTypes[0]);

        if (input instanceof Collection) {
            Collection inputCollection = (Collection)input;
            Assert.assertThat(inputCollection.size(), is(greaterThan(0)));
            for (Object entry : inputCollection) {
                Class<?> [] remainingExpectedTypes = new Class<?>[expectedTypes.length - 1];
                System.arraycopy(expectedTypes, 1, remainingExpectedTypes, 0, remainingExpectedTypes.length);
                assertParameterOfExpectedStructure(entry, remainingExpectedTypes);
            }
        }
    }

    private void assertTypeIsAssignable(Object input, Class<?> type) {
        Assert.assertTrue("Type [" + type + "is cannot be assigned to input [" + input.getClass() + "]",
                type.isAssignableFrom(input.getClass()));
    }
}