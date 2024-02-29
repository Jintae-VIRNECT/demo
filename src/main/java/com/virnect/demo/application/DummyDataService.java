package com.virnect.demo.application;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.virnect.demo.dto.SensorData;

/**
 * Project        : demo
 * DATE           : 2024-02-08
 * AUTHOR         : jtkim (Jintae kim)
 * EMAIL          : jtkim@virnect.com
 * DESCRIPTION    :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-08      jtkim          최초 생성
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DummyDataService {
	private static final Random random = new Random();

	public SensorData read() {
		return SensorData.builder()
			.temperatureSensors(IntStream.rangeClosed(1, 5)
				.mapToObj(i -> SensorData.TemperatureSensor.builder()
					.id(i)
					.value(7 + random.nextInt(14)) // 7~20 범위의 값
					.build())
				.toList())
			.speeds(List.of(SensorData.Speed.builder() // Speed로 교체
				.id(1)
				.value(75 + random.nextInt(21)) // 75~95 범위의 값
				.build()))
			.waterLevels(IntStream.rangeClosed(1, 5)
				.mapToObj(i -> SensorData.WaterLevel.builder()
					.id(i)
					.value(random.nextInt(101)) // 기존 요구사항 유지
					.build())
				.toList())
			.flows(IntStream.rangeClosed(1, 3)
				.mapToObj(i -> SensorData.Flow.builder()
					.id(i)
					.value(30 + random.nextInt(31)) // 30~60 범위의 값
					.build())
				.toList())
			.valves(IntStream.rangeClosed(1, 3)
				.mapToObj(i -> SensorData.Valve.builder()
					.id(i)
					.value(random.nextBoolean()) // 기존 요구사항 유지
					.build())
				.toList())
			.pumps(IntStream.rangeClosed(1, 2)
				.mapToObj(i -> SensorData.Pump.builder()
					.id(i)
					.value(random.nextBoolean()) // 기존 요구사항 유지
					.build())
				.toList())
			.rotaryMotor(SensorData.RotaryMotor.builder()
				.id(1)
				.value(random.nextBoolean()) // 기존 요구사항 유지
				.build())
			.motorSpeedControl(SensorData.Motor.builder()
				.id(1)
				.value(random.nextInt(101)) // 기존 요구사항 유지
				.build())
			.motorSpeedMonitor(SensorData.Motor.builder()
				.id(1)
				.value(random.nextInt(101)) // 기존 요구사항 유지
				.build())
			.build();
	}
}
