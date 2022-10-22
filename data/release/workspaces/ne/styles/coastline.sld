<?xml version="1.0" encoding="ISO-8859-1"?>
<StyledLayerDescriptor version="1.0.0"
  xsi:schemaLocation="http://www.opengis.net/sld http://schemas.opengis.net/sld/1.0.0/StyledLayerDescriptor.xsd"
  xmlns="http://www.opengis.net/sld" xmlns:ogc="http://www.opengis.net/ogc"
  xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <NamedLayer>
    <Name>coastline</Name>
    <UserStyle>
      <FeatureTypeStyle>
        <Rule>
          <Title>Coastline</Title>
          <MinScaleDenominator>7.0E7</MinScaleDenominator>
          <LineSymbolizer>
            <Stroke>
              <CssParameter name="stroke">#B3CCD1</CssParameter>
              <CssParameter name="stroke-width">0.5</CssParameter>
            </Stroke>
          </LineSymbolizer>
        </Rule>
        <Rule>
          <Title>Coastline</Title>
          <MaxScaleDenominator>7.0E7</MaxScaleDenominator>
          <MinScaleDenominator>3.5E7</MinScaleDenominator>
          <LineSymbolizer>
            <Stroke>
              <CssParameter name="stroke">#B3CCD1</CssParameter>
              <CssParameter name="stroke-width">0.75</CssParameter>
            </Stroke>
          </LineSymbolizer>
        </Rule>
        <Rule>
          <Title>Coastline</Title>
          <MaxScaleDenominator>3.5E7</MaxScaleDenominator>
          <MinScaleDenominator>2.0E7</MinScaleDenominator>
          <LineSymbolizer>
            <Stroke>
              <CssParameter name="stroke">#B3CCD1</CssParameter>
              <CssParameter name="stroke-width">1.00</CssParameter>
            </Stroke>
          </LineSymbolizer>
        </Rule>
        <Rule>
          <Title>Coastline</Title>
          <MaxScaleDenominator>2.0E7</MaxScaleDenominator>
          <LineSymbolizer>
            <Stroke>
              <CssParameter name="stroke">#B3CCD1</CssParameter>
              <CssParameter name="stroke-width">1.50</CssParameter>
            </Stroke>
          </LineSymbolizer>
        </Rule>
      </FeatureTypeStyle>
    </UserStyle>
  </NamedLayer>
</StyledLayerDescriptor>