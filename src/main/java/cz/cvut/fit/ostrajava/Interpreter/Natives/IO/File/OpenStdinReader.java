package cz.cvut.fit.ostrajava.Interpreter.Natives.IO.File;

import cz.cvut.fit.ostrajava.Interpreter.Converter;
import cz.cvut.fit.ostrajava.Interpreter.InterpreterException;
import cz.cvut.fit.ostrajava.Interpreter.Memory.Array;
import cz.cvut.fit.ostrajava.Interpreter.Memory.Heap;
import cz.cvut.fit.ostrajava.Interpreter.Natives.Native;
import cz.cvut.fit.ostrajava.Interpreter.StackValue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * Created by tomaskohout on 12/1/15.
 */
public class OpenStdinReader extends Native {

    public OpenStdinReader(Heap heap) {
        super(heap);
    }

    @Override
    public StackValue invoke(StackValue[] args) throws InterpreterException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int handle = Readers.getInstance().add(br);
        return new StackValue(handle, StackValue.Type.Primitive);
    }
}
