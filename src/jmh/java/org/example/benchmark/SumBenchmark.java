package org.example.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class SumBenchmark {
    @Benchmark
    public void forSum(Blackhole bh){
        bh.consume(Sum.forSum());
    }
    @Benchmark
    public void streamSum(Blackhole bh){
        bh.consume(Sum.streamSum());
    }
}
