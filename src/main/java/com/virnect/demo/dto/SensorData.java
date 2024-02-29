package com.virnect.demo.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Project        : demo
 * DATE           : 2024-02-20
 * AUTHOR         : jtkim (Jintae kim)
 * EMAIL          : jtkim@virnect.com
 * DESCRIPTION    :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20      jtkim          최초 생성
 */

@Getter
@Setter
@Builder
public class SensorData {
	@Builder.Default
	private List<TemperatureSensor> temperatureSensors = new ArrayList<>();
	@Builder.Default
	private List<Speed> speeds = new ArrayList<>();
	@Builder.Default
	private List<WaterLevel> waterLevels = new ArrayList<>();
	@Builder.Default
	private List<Flow> flows = new ArrayList<>();
	@Builder.Default
	private List<Valve> valves = new ArrayList<>();
	@Builder.Default
	private List<Pump> pumps = new ArrayList<>();
	private RotaryMotor rotaryMotor;
	private Motor motorSpeedControl;
	private Motor motorSpeedMonitor;

	@Getter
	@Builder
	public static class TemperatureSensor {
		private int id;
		private int value;
	}

	@Getter
	@Builder
	public static class Speed {
		private int id;
		private int value;
	}

	@Getter
	@Builder
	public static class WaterLevel {
		private int id;
		private int value;
	}

	@Getter
	@Builder
	public static class Flow {
		private int id;
		private int value;
	}

	@Getter
	@Builder
	public static class Valve {
		private int id;
		private boolean value;
	}

	@Getter
	@Builder
	public static class Pump {
		private int id;
		private boolean value;
	}

	@Getter
	@Builder
	public static class Motor {
		private int id;
		private int value;
	}

	@Getter
	@Builder
	public static class RotaryMotor {
		private int id;
		private boolean value;
	}

}