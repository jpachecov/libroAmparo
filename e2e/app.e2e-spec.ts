import { LibroAmparoPage } from './app.po';

describe('libro-amparo App', () => {
  let page: LibroAmparoPage;

  beforeEach(() => {
    page = new LibroAmparoPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
