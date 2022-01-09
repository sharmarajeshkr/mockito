package com.sharma.mock.listinterface;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListInterfaceMockTest {

    List<String> l = mock(List.class);

    @Test
    public void testSize(){
        when(l.size()).thenReturn(10);
        assertEquals(10,l.size());
    }

    @Test
    public void testReturningMultipleValues(){
        when(l.size()).thenReturn(10)
                .thenReturn(9)
                .thenReturn(2);
        ;
        assertEquals(10,l.size());
        assertEquals(9,l.size());
        assertEquals(2,l.size());

    }

    @Test
    public void testgetList(){
        when(l.get(0)).thenReturn("A");
        assertEquals("A",l.get(0));

    }





}
