package com.virnect.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.virnect.demo.application.DummyDataService;
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
@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class DummyDataController {

	private final DummyDataService dummyDataService;

	@GetMapping("/demo/result")
	public SensorData read(
	) {
		return dummyDataService.read();
	}
}
