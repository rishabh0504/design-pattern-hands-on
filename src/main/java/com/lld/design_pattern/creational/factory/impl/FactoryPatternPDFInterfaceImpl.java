package com.lld.design_pattern.creational.factory.impl;

import com.lld.design_pattern.creational.factory.intrface.DocGeneratorInterface;
import com.lld.design_pattern.creational.factory.intrface.FactoryPatternInterface;

public class FactoryPatternPDFInterfaceImpl implements FactoryPatternInterface{
	@Override
	public DocGeneratorInterface createInstance() {
		// TODO Auto-generated method stub
		return new PDFgeneratorImpl();
	}
}