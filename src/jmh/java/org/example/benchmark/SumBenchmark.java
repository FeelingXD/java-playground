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
    @Benchmark
    public void parallelStreamSum(Blackhole bh){
        bh.consume(Sum.parallelStreamSum());
    }

    @Benchmark
    public void arrayForSum(Blackhole bh){
        bh.consume(Sum.arrayForSum());
    }
    @Benchmark
    public void arrayStreamSum(Blackhole bh){
        bh.consume(Sum.arrayStreamSum());
    }
    @Benchmark
    public void arrayParallelStreamSum(Blackhole bh){
        bh.consume(Sum.arrayParallelStreamSum());
    }
    @Benchmark
    public void arrayListForSum(Blackhole bh){
        bh.consume(Sum.arrayListForSum());
    }
    @Benchmark
    public void arrayListStreamSum(Blackhole bh){
        bh.consume(Sum.arrayListStreamSum());
    }
}
