package com.betrybe.museumfinder.solution;

import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@AutoConfigureMockMvc

public class CollectionTypeControllerTest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  MuseumServiceInterface museumServiceInterface;



// ...

  @Test
  public void getMuseumByIdTest() throws Exception {
    Long id = 9223372036854775801L;
    MuseumDto museumDto = ModelDtoConverter.modelToDto(MuseumMock.MuseumMockToTest());
    given(museumServiceInterface.getMuseum(id)).willReturn(MuseumMock.MuseumMockToTest());

    mockMvc.perform(MockMvcRequestBuilders.get("/museums/" + id)
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id", is(id)));
  }

}
